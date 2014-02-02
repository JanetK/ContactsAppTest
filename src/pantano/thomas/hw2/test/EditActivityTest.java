package pantano.thomas.hw2.test;

import pantano.thomas.hw2.EditActivity;
import pantano.thomas.hw2.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class EditActivityTest extends ActivityInstrumentationTestCase2<EditActivity> {

	private EditActivity editActivity;

	public EditActivityTest() {
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

	public void testEditView() {
		//pass in a contact to edit

//	    Intent intent = new Intent(getInstrumentation().getTargetContext(), DisplayActivity.class);
//      startActivity(intent, null, null);

	}

	protected void tearDown() throws Exception {
		editActivity.finish();
		super.tearDown();
	}

}
