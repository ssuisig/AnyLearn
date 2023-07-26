// Generated by view binder compiler. Do not edit!
package ddwu.com.mobile.anylearn2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ddwu.com.mobile.anylearn2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScriptSaveChoiceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton noSaveBtn;

  @NonNull
  public final AppCompatButton saveBtn;

  @NonNull
  public final TextView saveChoiceMainBar;

  @NonNull
  public final TextView saveChoiceMainBarOption;

  @NonNull
  public final TextView saveChoiceText;

  private ActivityScriptSaveChoiceBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton noSaveBtn, @NonNull AppCompatButton saveBtn,
      @NonNull TextView saveChoiceMainBar, @NonNull TextView saveChoiceMainBarOption,
      @NonNull TextView saveChoiceText) {
    this.rootView = rootView;
    this.noSaveBtn = noSaveBtn;
    this.saveBtn = saveBtn;
    this.saveChoiceMainBar = saveChoiceMainBar;
    this.saveChoiceMainBarOption = saveChoiceMainBarOption;
    this.saveChoiceText = saveChoiceText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScriptSaveChoiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScriptSaveChoiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_script_save_choice, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScriptSaveChoiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.no_save_btn;
      AppCompatButton noSaveBtn = ViewBindings.findChildViewById(rootView, id);
      if (noSaveBtn == null) {
        break missingId;
      }

      id = R.id.save_btn;
      AppCompatButton saveBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.saveChoice_mainBar;
      TextView saveChoiceMainBar = ViewBindings.findChildViewById(rootView, id);
      if (saveChoiceMainBar == null) {
        break missingId;
      }

      id = R.id.saveChoice_mainBar_option;
      TextView saveChoiceMainBarOption = ViewBindings.findChildViewById(rootView, id);
      if (saveChoiceMainBarOption == null) {
        break missingId;
      }

      id = R.id.saveChoice_text;
      TextView saveChoiceText = ViewBindings.findChildViewById(rootView, id);
      if (saveChoiceText == null) {
        break missingId;
      }

      return new ActivityScriptSaveChoiceBinding((ConstraintLayout) rootView, noSaveBtn, saveBtn,
          saveChoiceMainBar, saveChoiceMainBarOption, saveChoiceText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}