package pantano.thomas.hw2.test;

import pantano.thomas.hw2.EditActivity;
import pantano.thomas.hw2.MainActivity;
import pantano.thomas.hw2.R;
import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.view.View;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mainActivity;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	public void setUp() throws Exception {
		super.setUp();

		mainActivity = getActivity();
	}

	public void testClickActionbarCreateButton_emptyEditView() throws Exception {

		//add monitor to check for the next activity
		ActivityMonitor monitor = getInstrumentation().addMonitor(
				EditActivity.class.getName(), null, false);
		
		View createAction =  (View) mainActivity.findViewById(R.id.action_create);
//		mainActivity.onOptionsItemSelected(createAction);
		TouchUtils.clickView(this, createAction);
		
		// Wait 2 seconds for the start of the activity
		EditActivity startedActivity = (EditActivity) monitor
				.waitForActivityWithTimeout(2000);
		
		assertNotNull(startedActivity);
	}
	
	public void testCreateView() {
		
//	    Intent intent = new Intent(getInstrumentation().getTargetContext(), DisplayActivity.class);
//      startActivity(intent, null, null);

	}


	protected void tearDown() throws Exception {
		mainActivity.finish();
		super.tearDown();
	}

}
