package com.example.ardberrylayouthome;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

public class SlideAnimationUtil {

    public static void slideInFromUp1(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up1);
    }
    public static void slideInFromUp2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up2);
    }
    public static void slideInFromUp3(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up3);
    }


    public static void slideInFromUp21(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up21);
    }
    public static void slideInFromUp22(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up22);
    }
    public static void slideInFromUp23(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up23);
    }
    public static void slideInFromUp24(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up24);
    }
    public static void slideInFromUp25(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_up25);
    }


    public static void slideIntoUp2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_up2);
        view.animate().alpha(0.0f);
    }


    public static void slideInFromDown1(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_down1);
    }
    public static void slideInFromDown2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_down2);
    }


    public static void slideIntodown2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_down2);
        view.animate().alpha(0.0f);
    }


    public static void slideInFromBottom21(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_bottom21);
    }
    public static void slideInFromBottom22(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_bottom22);
    }


    public static void slideInFromLeft1(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_left1);
    }
    public static void slideInFromLeft3(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_left3);
    }


    public static void slideInFromLeft21(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_left21);
    }
    public static void slideInFromLeft22(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_left22);
    }
    public static void slideInFromLeft23(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_left23);
    }
    public static void slideInFromLeft24(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_left24);
    }


    public static void slideOutToLeft(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_left);
        view.animate().alpha(0.0f);
    }
    public static void slideOutToLeft1(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_left_card1);
        view.animate().alpha(0.0f);
    }
    public static void slideOutToLeft2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_left_card2);
        view.animate().alpha(0.0f);
    }
    public static void slideOutToLeft3(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_left_card3);
        view.animate().alpha(0.0f);
    }


    public static void slideInFromRight2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_right2);
    }
    public static void slideInFromRight4(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_right4);
    }


    public static void slideInFromRight21(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_right21);
    }
    public static void slideInFromRight22(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_right22);
    }
    public static void slideInFromRight23(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_right23);
    }
    public static void slideInFromRight24(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_from_right24);
    }


    public static void slideOutToRight(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_right);
        view.animate().alpha(0.0f);

    }
    public static void slideOutToRight1(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_right_card7);
        view.animate().alpha(0.0f);
    }
    public static void slideOutToRight2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_right_card8);
        view.animate().alpha(0.0f);
    }
    public static void slideOutToRight3(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_to_right9);
        view.animate().alpha(0.0f);
    }


    public static void slideClickFocus1(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_click_focus1);
    }
    public static void slideClickFocus2(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_click_focus2);
    }
    public static void slideClickFocus3(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_click_focus3);
    }
    public static void slideClickFocus4(Context context, View view) {
        runSimpleAnimation(context, view, R.anim.slide_click_focus4);
    }

    public static void fadecard4(Context context, View view){
        runSimpleAnimation(context, view, R.anim.fade_activity_card4);
        view.animate().alpha(0.0f);
    }
    public static void fadecard5(Context context, View view){
        runSimpleAnimation(context, view, R.anim.fade_activity_card5);
        view.animate().alpha(0.0f);
    }
    public static void fadecard6(Context context, View view){
        runSimpleAnimation(context, view, R.anim.fade_activity_card6);
        view.animate().alpha(0.0f);
    }

    public static void fadehalf(Context context, View view){
        runSimpleAnimation(context,view,R.anim.fade_half);
    }
    public static void fadehalfrepeat(Context context, View view){
        runSimpleAnimation(context,view,R.anim.fade_half_repeat);
    }


    public static void fadeMain1(Context context, View view){
        runSimpleAnimation(context,view,R.anim.fade_main_1);
    }
    public static void fadeMain2(Context context, View view){
        runSimpleAnimation(context,view,R.anim.fade_main_2);
    }
    public static void fadeMain3(Context context, View view){
        runSimpleAnimation(context,view,R.anim.fade_main_3);
    }
    public static void fadeMain4(Context context, View view){
        runSimpleAnimation(context,view,R.anim.fade_main_4);
    }
    public static void fadeMain5(Context context, View view){
        runSimpleAnimation(context,view,R.anim.fade_main_5);
    }



    private static void runSimpleAnimation(Context context, View view, int animationId) {
        view.startAnimation(AnimationUtils.loadAnimation(
                context, animationId
        ));
    }

}
