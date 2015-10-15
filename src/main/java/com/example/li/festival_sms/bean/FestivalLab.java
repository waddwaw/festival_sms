package com.example.li.festival_sms.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by li on 2015/9/30.
 */
public class FestivalLab {
    private static FestivalLab mInstance;
    private List<Festival> mFestivals = new ArrayList<Festival>();
    private List<Msg> mMsgs = new ArrayList<Msg>();
    private FestivalLab() {
        mFestivals.add(new Festival(1, "国庆节"));
        mFestivals.add(new Festival(2, "中秋节"));
        mFestivals.add(new Festival(3, "元旦节"));
        mFestivals.add(new Festival(4, "春节"));
        mFestivals.add(new Festival(5, "七夕"));
        mFestivals.add(new Festival(6, "艹"));
        mFestivals.add(new Festival(7,"日"));
        mMsgs.add(new Msg(1,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(2,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(3,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(4,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(5,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(6,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(7,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(8,1,"日日日日日日i日日日日"));
        mMsgs.add(new Msg(9,1,"日日日日日日i日日日日"));
    }

    public List<Msg> getMsgsByFestivalId(int fesId){
        List<Msg> msgs = new ArrayList<>();
        for(Msg msg : mMsgs)
        {
            if(msg.getFestivalId() ==  fesId){
                msgs.add(msg);
            }
        }
        return msgs;
    }

    public Msg getMsgByMsgId(int id){
        for(Msg msg : mMsgs){
            if(msg.getId() == id){
                return msg;
            }
        }
        return null;
    }
    public List<Festival> getmFestivals(){
        return  new ArrayList<Festival>(mFestivals);
    }

    public Festival getFestivalById(int fesId){
        for(Festival festival : mFestivals){
            if(festival.getId()==fesId)
                return  festival;
    }
        return  null;
    }

    public static FestivalLab getmInstance() {
        if (mInstance == null) {
            synchronized (FestivalLab.class) {
                if (mInstance == null) {
                    mInstance = new FestivalLab();
                }
            }
        }
        return mInstance;
    }
}
