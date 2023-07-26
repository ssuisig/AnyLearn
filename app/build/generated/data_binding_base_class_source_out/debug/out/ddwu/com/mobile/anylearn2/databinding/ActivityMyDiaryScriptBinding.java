// Generated by view binder compiler. Do not edit!
package ddwu.com.mobile.anylearn2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ddwu.com.mobile.anylearn2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyDiaryScriptBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView diaryNextBtn;

  @NonNull
  public final TextView diaryPreBtn;

  @NonNull
  public final TextView diaryScriptBase;

  @NonNull
  public final AppCompatButton diaryScriptChangeBtn;

  @NonNull
  public final RecyclerView diaryScriptComment;

  @NonNull
  public final TextView diaryScriptDate;

  @NonNull
  public final Button diaryScriptDateChoice;

  @NonNull
  public final ImageView diaryScriptHomeBtn;

  @NonNull
  public final TextView diaryScriptMainBar;

  @NonNull
  public final TextView diaryScriptMainBarOption;

  @NonNull
  public final AppCompatButton diaryScriptSaveBtn;

  private ActivityMyDiaryScriptBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView diaryNextBtn, @NonNull TextView diaryPreBtn,
      @NonNull TextView diaryScriptBase, @NonNull AppCompatButton diaryScriptChangeBtn,
      @NonNull RecyclerView diaryScriptComment, @NonNull TextView diaryScriptDate,
      @NonNull Button diaryScriptDateChoice, @NonNull ImageView diaryScriptHomeBtn,
      @NonNull TextView diaryScriptMainBar, @NonNull TextView diaryScriptMainBarOption,
      @NonNull AppCompatButton diaryScriptSaveBtn) {
    this.rootView = rootView;
    this.diaryNextBtn = diaryNextBtn;
    this.diaryPreBtn = diaryPreBtn;
    this.diaryScriptBase = diaryScriptBase;
    this.diaryScriptChangeBtn = diaryScriptChangeBtn;
    this.diaryScriptComment = diaryScriptComment;
    this.diaryScriptDate = diaryScriptDate;
    this.diaryScriptDateChoice = diaryScriptDateChoice;
    this.diaryScriptHomeBtn = diaryScriptHomeBtn;
    this.diaryScriptMainBar = diaryScriptMainBar;
    this.diaryScriptMainBarOption = diaryScriptMainBarOption;
    this.diaryScriptSaveBtn = diaryScriptSaveBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyDiaryScriptBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyDiaryScriptBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_diary_script, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyDiaryScriptBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.diary_next_btn;
      TextView diaryNextBtn = ViewBindings.findChildViewById(rootView, id);
      if (diaryNextBtn == null) {
        break missingId;
      }

      id = R.id.diary_pre_btn;
      TextView diaryPreBtn = ViewBindings.findChildViewById(rootView, id);
      if (diaryPreBtn == null) {
        break missingId;
      }

      id = R.id.diary_script_base;
      TextView diaryScriptBase = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptBase == null) {
        break missingId;
      }

      id = R.id.diary_script_change_btn;
      AppCompatButton diaryScriptChangeBtn = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptChangeBtn == null) {
        break missingId;
      }

      id = R.id.diary_script_comment;
      RecyclerView diaryScriptComment = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptComment == null) {
        break missingId;
      }

      id = R.id.diary_script_date;
      TextView diaryScriptDate = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptDate == null) {
        break missingId;
      }

      id = R.id.diary_script_date_choice;
      Button diaryScriptDateChoice = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptDateChoice == null) {
        break missingId;
      }

      id = R.id.diary_script_home_btn;
      ImageView diaryScriptHomeBtn = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptHomeBtn == null) {
        break missingId;
      }

      id = R.id.diary_script_mainBar;
      TextView diaryScriptMainBar = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptMainBar == null) {
        break missingId;
      }

      id = R.id.diary_script_mainBar_option;
      TextView diaryScriptMainBarOption = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptMainBarOption == null) {
        break missingId;
      }

      id = R.id.diary_script_save_btn;
      AppCompatButton diaryScriptSaveBtn = ViewBindings.findChildViewById(rootView, id);
      if (diaryScriptSaveBtn == null) {
        break missingId;
      }

      return new ActivityMyDiaryScriptBinding((ConstraintLayout) rootView, diaryNextBtn,
          diaryPreBtn, diaryScriptBase, diaryScriptChangeBtn, diaryScriptComment, diaryScriptDate,
          diaryScriptDateChoice, diaryScriptHomeBtn, diaryScriptMainBar, diaryScriptMainBarOption,
          diaryScriptSaveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}