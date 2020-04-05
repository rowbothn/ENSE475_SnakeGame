package com.codepath.proj_Code;

import android.arch.lifecycle.ViewModel;

public class GameSettingsViewModel extends ViewModel
{
    public String selectedItem;

    GameSettingsViewModel()
    {
        selectedItem = "Easy";
    }
}
