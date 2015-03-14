package com.example.android.code.app;


public class TrueFalse {
    private int mQuestion;

    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getmQuestion(){
        return mQuestion;
    }

    public void setmQuestion(int question){
        mQuestion = question;
    }

    protected boolean ismTrueQuestion(){
        return mTrueQuestion;
    }

    public void setmTrueQuestion(boolean trueQuestion){

    }
}
