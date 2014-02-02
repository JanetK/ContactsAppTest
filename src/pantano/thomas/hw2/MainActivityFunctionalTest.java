package pantano.thomas.hw2;

import pantano.thomas.hw2.EditActivity;
import pantano.thomas.hw2.MainActivity;
import pantano.thomas.hw2.R;
import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
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
		
//		TouchUtils.clickView(this, createAction);
//
//		// Wait 2 seconds for the start of the activity
//		EditActivity startedActivity = (EditActivity) monitor.waitForActivityWithTimeout(2000);
//		assertNotNull(startedActivity);

	}

	protected void tearDown() throws Exception {
		mainActivity.finish();
		super.tearDown();
	}

}
