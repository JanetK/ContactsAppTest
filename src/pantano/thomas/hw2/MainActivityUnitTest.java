package pantano.thomas.hw2;

import java.util.Calendar;

import android.content.Intent;
import android.test.ActivityUnitTestCase;


/**
 * This class tests activities in MainActivity in isolation and the layout of the ListContacts view.  
 */
public class MainActivityUnitTest extends ActivityUnitTestCase<MainActivity> {

	private MainActivity mainActivity;
	
	public MainActivityUnitTest() {
		
		super(MainActivity.class);
	}

	
	@Override
	protected void setUp() throws Exception {
		
		super.setUp();
		
        //launch MainActivity
		Intent launchIntent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(launchIntent, null, null);
        mainActivity = getActivity();
	}


	public void testContactList_layout() {
		
		//verify that this view displays a list of contacts
	}
	
	
	public void testIntent_triggerViaOnListItemClick() {

		mainActivity.onListItemClick(null, null, 0, 0);
		
		Intent triggeredIntent = getStartedActivityIntent();
		assertNotNull(triggeredIntent);

		Contact actualContact = (Contact)triggeredIntent.getExtras().get("contact");
		Contact expectedContact = new Contact("Tommy P", "Tommy", "Pantano", Calendar.getInstance().getTimeInMillis(), "717-687-7670", "410-993-5564", "717-808-5030", "tommy.r.pantano@gmail.com");
		assertEquals(expectedContact.getDisplayName(), actualContact.getDisplayName());
		assertEquals(expectedContact.getHomePhone(), actualContact.getHomePhone());
		assertEquals(expectedContact.getEmailAddress(), actualContact.getEmailAddress());
	}


	public void testIntent_triggerViaOnOptionsItemSelected() {

	}
	
	
	protected void tearDown() throws Exception {
		mainActivity.finish();
		super.tearDown();
	}
}
