package frc.robot;

//http://robotsforroboticists.com/pid-control/
public class PIDController {
	private double proportionalGain, derivativeGain, integralGain;
	private double output, minOutput, maxOutput;
	private double target, previousError;
	private double previousIntegral;
	
	private long startTime = System.currentTimeMillis();
	private long endTime = System.currentTimeMillis();
	
	private boolean firstRun = true;
	
	public PIDController(double target, double minOutput, double maxOutput, double proportionalGain, double derivativeGain, double integralGain) {
		this.target = target;
		this.minOutput = minOutput;
		this.maxOutput = maxOutput;
		this.proportionalGain = proportionalGain;
		this.derivativeGain = derivativeGain;
		this.integralGain = integralGain;
	}
	
	public double Update(double currentValue) {
		endTime = System.currentTimeMillis();
		
        double iterationTime = endTime - startTime;
        
        double proportionalComponent = target - currentValue;
		double error = proportionalComponent;
		double integralComponent = previousIntegral + (error * iterationTime);
        double derivativeComponent = (error - previousError) / iterationTime;
        
		if(firstRun) {
            integralComponent = 0;
            derivativeComponent = 0;
			
			firstRun = false;
		}
		
		output = (proportionalGain * proportionalComponent) +  (integralGain * integralComponent) + (derivativeGain * derivativeComponent);
		
		if(output < minOutput) {
			output = minOutput;
		}
		if(output > maxOutput) {
			output = maxOutput;
		}
		
		startTime = System.currentTimeMillis();
		return output;
	}
	
	public double getOutput() {
		return output;
	}
}
