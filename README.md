# PhoneEditText-Android

PhoneEditText makes it easy for you to handel country codes in Phone number fields of your android application.
PhoneEditText identifies your country and sets its respective dial code automatically.

<p align="center">
<a href="https://jitpack.io/#amannirala13/PhoneEditText-Android"><img src="https://img.shields.io/jitpack/v/github/amannirala13/PhoneEditText-Android"></a>
<a href="https://github.com/amannirala13/PhoneEditText-Android/issues"><img src="https://img.shields.io/github/issues/amannirala13/PhoneEditText-Android"></a>
<a href="https://github.com/amannirala13/PhoneEditText-Android/pulls"><img src="https://img.shields.io/github/issues-pr/amannirala13/PhoneEditText-Android"></a>
<a href="https://github.com/amannirala13/PhoneEditText-Android/network/members"><img alt = "forks-badge" src="https://img.shields.io/github/forks/amannirala13/PhoneEditText-Android?color=blueviolet"></a>
<a href="https://github.com/amannirala13/PhoneEditText-Android/stargazers"><img alt = "stars-badge" src="https://img.shields.io/github/stars/amannirala13/PhoneEditText-Android?color=yellow"></a>
<a href="https://github.com/amannirala13/PhoneEditText-Android/watchers"><img alt="watcher-badge" src="https://img.shields.io/github/watchers/amannirala13/PhoneEditText-Android?color=teal"></a>
<a href="https://github.com/amannirala13/PhoneEditText-Android/archive/master.zip"><img alt = "repo_size-badge" src="https://img.shields.io/github/repo-size/amannirala13/PhoneEditText-Android"></a>
</p>

<p align="center">
<a href="https://app.fossa.com/reports/a1e8a7ce-7cf4-46fb-857b-54dc0288a448"><img src="https://img.shields.io/github/license/amannirala13/PhoneEditText-Android"></a>
<a href="https://app.fossa.com/projects/git%2Bgithub.com%2Famannirala13%2FPhoneEditText-Android?ref=badge_shield" alt="FOSSA Status"><img src="https://app.fossa.com/api/projects/git%2Bgithub.com%2Famannirala13%2FPhoneEditText-Android.svg?type=shield"/></a>
<a href="https://app.codacy.com/manual/asdevofficial/PhoneEditText-Android?utm_source=github.com&utm_medium=referral&utm_content=amannirala13/PhoneEditText-Android&utm_campaign=Badge_Grade_Dashboard"><img src="https://api.codacy.com/project/badge/Grade/0150f7558631449fa1e9e5b7f5b2bede"></a>
<a href="https://www.codefactor.io/repository/github/amannirala13/phoneedittext-android/overview/master"><img src="https://www.codefactor.io/repository/github/amannirala13/phoneedittext-android/badge/master" alt="CodeFactor" /></a>
</p>

## How to use?

![](demo.gif)

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
    				implementation 'com.google.android.material:material:1.1.0-alpha09'
    				implementation 'com.github.amannirala13:PhoneEditText-Android:1.1.1'
    		}

### Jcenter

Add the dependency to **App** level **build.gradel** file

    implementation 'com.google.android.material:material:1.1.0-alpha09'
    implementation 'com.asdev.PhoneEditText-Android:PhoneEditText-Android:1.1.1'

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

---

### Advantages

- No drop down lists.
- No user based inputs
- No predictive definations of dial codes.
- Dial code can be changed upon the wish of the user
- Full support of TextInputEditText

### Limitations

- Sets the country code to default +91 when the device is on a WiFi network

## License

[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Famannirala13%2FPhoneEditText-Android.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Famannirala13%2FPhoneEditText-Android?ref=badge_large)

## ❤ Connect and Support

We would love to connect with you on different social media platforms, here are the links to all out social-media and coding platform handles where you can follow our work.

<p align="center">
<a href="https://github.com/amannirala13?tab=followers"><img alt = "github_follow_badge" src="https://img.shields.io/github/followers/amannirala13?label=Follow&style=social"/></a>
<a href = "https://twitter.com/AmanNirala13"><img alt="twitter-badge" src="https://img.shields.io/twitter/follow/amannirala13?label=Follow%20us&style=social"/></a>
</p>

<p align="center">
<a href="https://www.facebook.com/amannirala13"><img src="https://img.shields.io/badge/Follow-Facebook-RoyalBlue"/></a>
<a href="https://www.linkedin.com/in/amannirala13"><img src="https://img.shields.io/badge/Follow-LinkedIn-Blue"/></a>
<a href="https://www.researchgate.net/profile/Aman_Nirala"><img src="https://img.shields.io/badge/Follow-Research Gate-DeepSkyBlue"/></a>
</p>

If you like our work, a bit of contribution would motivate us a lot for more open source contributions.

<p align="center">
<a href="https://www.paypal.me/amannirala13"><img src="https://img.shields.io/badge/Donate-Paypal-blue?style=for-the-badge"></a>
</p>
