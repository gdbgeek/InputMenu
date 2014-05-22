package com.tchart.inputmenu;

import android.app.AlertDialog;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.Msgbox;
import anywheresoftware.b4a.objects.collections.List;

@BA.ActivityObject
@BA.Version(1.0F)
@BA.ShortName("InputMenu")
@BA.Author("Trevor Hart")

public class InputMenuWrapper {
	
  public static int Show(List Items, String Title, BA ba)
  {
	      AlertDialog.Builder b = new AlertDialog.Builder(ba.context);
	      CharSequence[] items = new CharSequence[Items.getSize()];
	      
	      for (int i = 0; i < Items.getSize(); i++)
	      {
	    	  Object o = Items.Get(i);
	    	  if ((o instanceof CharSequence))
	    		  items[i] = ((CharSequence)o);
	    	  else
    	          items[i] = String.valueOf(o);
	      }	      
      
	      Msgbox.DialogResponse dr = new Msgbox.DialogResponse(true);
	      b.setItems(items, dr);
	      b.setTitle(Title);
	      Msgbox.msgbox(b.create(), false);
	      return dr.res;
  }
}
