package com.handsome.didi.Utils;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * @author 许英俊 2017/6/19
 */
public class AlertUtils {

    /**
     * 弹出对话框
     *
     * @param context
     * @param message
     */
    public static void showAlert(Context context, String message) {
        Dialog dlg = new AlertDialog.Builder(context)
                .setTitle("温馨提示")
                .setPositiveButton(android.R.string.ok, null)
                .setMessage(message)
                .setCancelable(true)
                .create();
        dlg.show();
    }

    /**
     * 弹出对话框，带有一个按钮
     *
     * @param context
     * @param message
     * @param positiveButtontxt
     * @param positiveListener
     */
    public static void showAlert(Context context, String message,
                                 CharSequence positiveButtontxt, DialogInterface.OnClickListener positiveListener) {
        Dialog dlg = new AlertDialog.Builder(context)
                .setTitle("温馨提示")
                .setPositiveButton(positiveButtontxt, positiveListener)
                .setMessage(message)
                .setCancelable(true)
                .create();
        dlg.show();
    }

    /**
     * 弹出对话框，带有两个按钮
     *
     * @param context
     * @param message
     * @param positiveButtontxt
     * @param positiveListener
     * @param negativeButtontxt
     * @param negativeListener
     */
    public static void showAlert(Context context, String message,
                                 CharSequence positiveButtontxt, DialogInterface.OnClickListener positiveListener,
                                 CharSequence negativeButtontxt, DialogInterface.OnClickListener negativeListener) {
        Dialog dlg = new AlertDialog.Builder(context)
                .setTitle("温馨提示")
                .setPositiveButton(positiveButtontxt, positiveListener)
                .setNegativeButton(negativeButtontxt, negativeListener)
                .setMessage(message)
                .setCancelable(true)
                .create();
        dlg.show();
    }

    /**
     * 弹出多选对话框
     *
     * @param context
     * @param items
     * @param selected
     * @param multiChoiceClickListener
     */
    public static void showAlert(Context context, String[] items, boolean[] selected,
                                 DialogInterface.OnMultiChoiceClickListener multiChoiceClickListener) {
        Dialog dlg = new AlertDialog.Builder(context)
                .setTitle("请选择")
                .setCancelable(true)
                .setMultiChoiceItems(items, selected, multiChoiceClickListener)
                .create();
        dlg.show();
    }

}
