# PhoneEditText-Android

PhoneEditText makes it easy for you to hande country codes in Phone number fields of your android application.
PhoneEditText identifies your country and sets its respective dial code automatically.

![](demo.gif)

## How to use?

### Jitpack
Add JitPack to your **Project** level **build.gradle** file

			allprojects {
				repositories {
					...
					maven { url 'https://jitpack.io' }
				}
			}
Add the Phone Edit Text Dependency to **App** level **build.gradel** file

		dependencies {
					implementation 'com.github.amannirala13:PhoneEditText-Android:Tag'
			}


### Jcenter
Add the dependency to **App** level **build.gradel** file

    compile 'com.asdev.PhoneEditText-Android:PhoneEditText-Android:Tag'

#### Version Tag
[![](https://jitpack.io/v/amannirala13/PhoneEditText-Android.svg)](https://jitpack.io/#amannirala13/PhoneEditText-Android)

### Using in XML layout
```xml
 <com.asdev.phoneedittext.PhoneEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        />
```
### Get Dial code
```java
import com.asdev.phoneedittext.PhoneEditText;
...
...
...
PhoneEditText myPhoneEditText = findViewById(R.id.YOUR_EDIT_TEXT_ID)
String code = myPhoneEditText.getDIAL_CODE();
/* return type of getDIAL_CODE() is String*/
```

------------


### Advantages
- No drop down lists.
- No user based inputs
- No predictive definations of dial codes.
- Dial code can be changed on the wish of the user
- Full support of TextInputEditText

### Limitations
- Sets the country code to default +91 when the device is on a WiFi network
