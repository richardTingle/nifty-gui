package de.lessvoid.nifty.examples.allcontrols;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.dropdown.controller.DropDownControl;
import de.lessvoid.nifty.controls.listbox.controller.ListBoxControl;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

public class AllControlsDemoStartScreen implements ScreenController {
  public void bind(final Nifty newNifty, final Screen screen) {
    DropDownControl dropDownControl = screen.findControl("dropDown", DropDownControl.class);
    dropDownControl.addItem("Item 1");
    dropDownControl.addItem("Item 2");
    dropDownControl.addItem("Item 3");
    dropDownControl.addItem("Item 4");
    dropDownControl.addItem("Item 5");
    dropDownControl.addItem("Item 6");
    dropDownControl.setSelectedItemIdx(0);

    ListBoxControl listBoxControl = screen.findControl("listBox", ListBoxControl.class);
    listBoxControl.addItem("Item 1");
    listBoxControl.addItem("Item 2");
    listBoxControl.addItem("Item 3");
    listBoxControl.addItem("Item 4");
    listBoxControl.addItem("Item 5");
    listBoxControl.addItem("Item 6");
  }

  public void onStartScreen() {
  }

  public void onEndScreen() {
  }
}
