package com.strangerevents;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

import java.util.Random;

public class StrangerEventsService extends ReactContextBaseJavaModule {

    StrangerEventsService(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "StrangerEventsService";
    }

    private void sendEvent(ReactContext reactContext,
                           String eventName,
                           @Nullable WritableMap params) {
        reactContext
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, params);
    }


    @ReactMethod
    public void start() {
        Random random = new Random();
        int randomNumber = random.nextInt(17);

        if (randomNumber == 0) return;
        switch (randomNumber) {
            case 1:
                this.emmitEvent("Max", "73", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Max.jpeg");
                return;
            case 2:
                this.emmitEvent("Billy", "150", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Billy.jpeg");
                return;
            case 3:
                this.emmitEvent("Will", "79", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Will.jpeg");
                return;
            case 4:
                this.emmitEvent("Eleven", "999", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Eleven.jpeg");
                return;
            case 5:
                this.emmitEvent("Billy", "230", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Billy.jpeg");
                return;
            case 6:
                this.emmitEvent("Nancy", "22", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Nancy.jpeg");
                return;
            case 7:
                this.emmitEvent("Mike", "45", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Mike.jpeg");
                return;
            case 8:
                this.emmitEvent("Robin", "7", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Robin.jpeg");
                return;
            case 9:
                this.emmitEvent("Dustin", "330", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Dustin.jpeg");
                return;
            case 10:
                this.emmitEvent("Jim", "50", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Jim.jpeg");
                return;
            case 11:
                this.emmitEvent("Jonathan", "200", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Jonathan.jpeg");
                return;
            case 12:
                this.emmitEvent("Joyce", "84", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Joyce.jpeg");
                return;
            case 13:
                this.emmitEvent("Dr Brenner", "77", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Dr Brenner.jpeg");
                return;
            case 14:
                this.emmitEvent("Murray", "230", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Murray.jpeg");
                return;
            case 15:
                this.emmitEvent("Eddie", "100", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Eddie.jpeg");
                return;
            case 16:
                this.emmitEvent("Vecna", "0", "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Vecna.png");
                return;
            default:
                this.emmitEvent("", "0", "");
        }


    }

    public void emmitEvent (String name, String punctuation, String url ) {
        WritableMap params = Arguments.createMap();
        params.putString("name", name);
        params.putString("punctuation", punctuation);
        params.putString("url", url);

        sendEvent(this.getReactApplicationContext(), "strangeEvent", params);
    }



}
