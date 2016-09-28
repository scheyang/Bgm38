package me.ewriter.bangumitv.ui.progress;

import me.ewriter.bangumitv.base.BasePresenter;
import me.ewriter.bangumitv.base.BaseView;

/**
 * Created by Zubin on 2016/9/28.
 */

public interface ProgressContract {

    interface Presenter extends BasePresenter {
        void requestProgress();
    }

    interface View extends BaseView<Presenter> {
        void setProgressBarVisible(int visible);

        void refresh();
    }

}