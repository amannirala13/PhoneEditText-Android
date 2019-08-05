package com.asdev.phoneedittext;

import android.content.Context;
import android.graphics.Rect;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;

import com.asdev.phoneedittext.helper.check;
import com.asdev.phoneedittext.helper.countryCode;
import com.google.android.material.textfield.TextInputEditText;

public class PhoneEditText extends TextInputEditText {

    public String DIAL_CODE;

    public PhoneEditText(Context context) {
        super(context);
    }

    public PhoneEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PhoneEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        set_country_code(this);
    }
    //Sets country code to the phone text
    private void set_country_code(TextInputEditText phoneText) {
        if (!new check().countryCodeExisting(phoneText)) {


            TelephonyManager tm = (TelephonyManager) this.getContext().getSystemService(Context.TELEPHONY_SERVICE);
            String countryCodeValue = tm.getNetworkCountryIso();

            DIAL_CODE = "+" +(new countryCode().getDialCode(countryCodeValue));

            if (phoneText.getText().length() <= 0)
                phoneText.setText("+" +(new countryCode().getDialCode(countryCodeValue)) + " ");
            else if (phoneText.getText().charAt(0) == '+')
                phoneText.setText("+" +(new countryCode().getDialCode(countryCodeValue)) + " " + phoneText.getText().toString().substring(1));
            else
                phoneText.setText("+" +(new countryCode().getDialCode(countryCodeValue)) + " " + phoneText.getText());

            int existingValueLength = phoneText.getText().length();
            phoneText.setSelection(existingValueLength);

        }
    }

    public String getDIAL_CODE() {
        return DIAL_CODE;
    }
}
