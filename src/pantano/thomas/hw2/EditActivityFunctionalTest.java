package pantano.thomas.hw2;

import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;

/**
 * This class tests EditActivity's activities that interact with different components.
 */
public class EditActivityFunctionalTest extends ActivityInstrumentationTestCase2<EditActivity> {

	private static final String NEW_DISPLAYNAME = "new displayname"; 
	
	private EditActivity editActivity;

	public EditActivityFunctionalTest() {
		super(EditActivity.class);
	}

	public void setUp() throws Exception {
		super.setUp();

		editActivity = getActivity();
	}

	public void testPreconditions() {
		
        assertNotNull("EditActivity is null", editActivity);
	}
	
	public void testEditView_isEmpty() {
		
		//verify that the EditContact view is initialized with the correct default value
		String expected = "";
		
		assertEquals(expected, ((EditText)editActivity.findViewById(R.id.displayNameText)).getText().toString());
		assertEquals(expected, ((EditText)editActivity.findViewById(R.id.firstNameText)).getText().toString());
		assertEquals(expected, ((EditText)editActivity.findViewById(R.id.lastNameText)).getText().toString());
		assertEquals(expected, ((EditText)editActivity.findViewById(R.id.homePhoneText)).getText().toString());
		assertEquals(expected, ((EditText)editActivity.findViewById(R.id.workPhoneText)).getText().toString());
		assertEquals(expected, ((EditText)editActivity.findViewById(R.id.mobilePhoneText)).getText().toString());
		assertEquals(expected, ((EditText)editActivity.findViewById(R.id.emailAddressText)).getText().toString());
	}

	public void testEditView_saveEdit() {

		//TODO: start the edit view with a contact
		ActivityMonitor monitor = getInstrumentation().addMonitor(
				DisplayActivity.class.getName(), null, false);

		final EditText displayNameText = (EditText) editActivity.findViewById(R.id.displayNameText);
		

		// set text
		editActivity.runOnUiThread(new Runnable() {

			@Override
			public void run() {
				displayNameText.setText(NEW_DISPLAYNAME);
			}
		});
		getInstrumentation().waitForIdleSync();
		
		//click the 'save' actionbar button 
		View saveAction =  (View) editActivity.findViewById(R.id.action_done);
//		TouchUtils.clickView(this, saveAction);
//		
//		//verify that the changes are saved
//		DisplayActivity displayActivity = (DisplayActivity) monitor.waitForActivity();
//		TextView editedTextView = (TextView)displayActivity.findViewById(R.id.displayName);

	}


	public void testEditView_cancelEdit() {
		
	}

	protected void tearDown() throws Exception {
		editActivity.finish();
		super.tearDown();
	}

}
