// Generated code from Butter Knife. Do not modify!
package com.example.butterknifesample;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.example.butterknifesample.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230720, "field 'mTextView'");
    target.mTextView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131230721, "method 'onClickButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickButton(p0);
        }
      });
  }

  public static void reset(com.example.butterknifesample.MainActivity target) {
    target.mTextView = null;
  }
}
