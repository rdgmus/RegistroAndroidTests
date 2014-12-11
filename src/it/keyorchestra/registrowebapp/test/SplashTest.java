package it.keyorchestra.registrowebapp.test;

import it.keyorchestra.registrowebapp.R;
import it.keyorchestra.registrowebapp.Splash;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class SplashTest extends ActivityInstrumentationTestCase2<Splash>{

	final String version = "v0.9-alpha";

    public SplashTest() {
		super(Splash.class);
		// TODO Auto-generated constructor stub
	}

	private Splash mFirstTestActivity;
    private TextView mFirstTestText;
    
    public void testPreconditions() {
        assertNotNull("mFirstTestActivity is null", mFirstTestActivity);
        assertNotNull("mFirstTestText is null", mFirstTestText);
    }

    public void testMyFirstTestTextView_labelText() {
        final String expected =
                mFirstTestActivity.getString(R.string.title);
        final String actual = mFirstTestText.getText().toString();
        assertEquals(expected, actual);
        assertTrue(expected.contains(version));
        String app_name =  mFirstTestActivity.getString(R.string.app_name);
        assertTrue(app_name.contains(version));
    }
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		 mFirstTestActivity = getActivity();
	        mFirstTestText =
	                (TextView) mFirstTestActivity
	                .findViewById(R.id.textViewTitle);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	
}
