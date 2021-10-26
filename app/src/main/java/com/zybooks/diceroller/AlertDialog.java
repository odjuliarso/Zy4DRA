package com.zybooks.diceroller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

class WarningDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireActivity())
                .setTitle(R.string.max_rolls)
                .setMessage(R.string.pass_dice)
                .setPositiveButton(R.string.yes, (dialog, id) -> {
                    // User clicked Yes
                })
                .setNegativeButton(R.string.no, (dialog, id) -> {
                    // User clicked No
                })
                .setNeutralButton(R.string.later, (dialog, id) -> {
                    // User clicked Maybe later
                })
                .create();
    }
}