package actions;

import gl.GLCamera;

public class ActionRotateCameraUnbuffered extends Action {
	private GLCamera myTargetCamera;

	public ActionRotateCameraUnbuffered(GLCamera targetCamera) {
		myTargetCamera = targetCamera;
	}

	@Override
	public boolean onOrientationChanged(float[] newValues) {
		myTargetCamera.setOrientationValues(newValues);
		return true;
	}

	@Override
	public boolean onTouchMove(float screenDeltaX, float screenDeltaY) {
		myTargetCamera.changeZAngleUnbuffered(screenDeltaY);
		return true;
	}

	@Override
	public boolean onAccelChanged(float[] values) {
		myTargetCamera.setAccelValues(values);
		return true;
	}

	@Override
	public boolean onMagnetChanged(float[] values) {
		myTargetCamera.setMagnetValues(values);
		return true;
	}

}