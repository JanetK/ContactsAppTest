package pantano.thomas.hw2;

import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.view.View;

/**
 * This class tests MainActivity's activities that interact with different components.
 */
public class MainActivityFunctionalTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mainActivity;

	public MainActivityFunctionalTest() {
		super(MainActivity.class);
	}

	public void setUp() throws Exception {
		super.setUp();

		mainActivity = getActivity();
	}

	
	public void testActionbarCreateButton_emptyEditView() throws Exception {

		//add monitor to check for the next activity
		ActivityMonitor monitor = getInstrumentation().addMonitor(
				EditActivity.class.getName(), null, false);

		View createAction =  (View) mainActivity.findViewById(R.id.action_create);
		TouchUtils.clickView(this, createAction);

		EditActivity startedActivity = (EditActivity) monitor.waitForActivity();
		assertNotNull(startedActivity);

	}

	protected void tearDown() throws Exception {
		mainActivity.finish();
		super.tearDown();
	}

}
