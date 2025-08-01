package tbclient.AddThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Advertisement;
import tbclient.Anti;
import tbclient.ContriInfo;
import tbclient.IconStampInfo;
import tbclient.PostAntiInfo;
import tbclient.ReplyExp;
import tbclient.SuccessToast;
import tbclient.TbInteraction;
import tbclient.ThreadEasterEgg;
import tbclient.Toast;
import tbclient.VcodeInfo;
import tbclient.ZhiBoInfoTW;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_COLOR_MSG = "";
    public static final String DEFAULT_EXT_MSG = "";
    public static final String DEFAULT_INVITEES_NUMBER = "";
    public static final String DEFAULT_MSG = "";
    public static final String DEFAULT_OPGROUP = "";
    public static final String DEFAULT_PID = "";
    public static final String DEFAULT_PRE_MSG = "";
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_VIDEO_ID = "";

    @ProtoField(tag = 12)
    public final Advertisement advertisement;

    @ProtoField(tag = 17)
    public final VcodeInfo anti;

    @ProtoField(tag = 15)
    public final Anti anti_stat;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String color_msg;

    @ProtoField(tag = 10)
    public final ContriInfo contri_info;

    @ProtoField(tag = 9)
    public final ReplyExp exp;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ext_msg;

    @ProtoField(tag = 13)
    public final IconStampInfo icon_stamp_info;

    @ProtoField(tag = 14)
    public final PostAntiInfo info;

    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String invitees_number;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String msg;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String opgroup;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pid;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pre_msg;

    @ProtoField(tag = 11)
    public final ThreadEasterEgg star_info;

    @ProtoField(tag = 21)
    public final SuccessToast success_toast;

    @ProtoField(tag = 16)
    public final TbInteraction tb_hudong;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tid;

    @ProtoField(tag = 20)
    public final Toast toast;

    @ProtoField(tag = 8)
    public final ZhiBoInfoTW twzhibo_info;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String video_id;

    public static final class Builder extends Message.Builder<DataRes> {
        public Advertisement advertisement;
        public VcodeInfo anti;
        public Anti anti_stat;
        public String color_msg;
        public ContriInfo contri_info;
        public ReplyExp exp;
        public String ext_msg;
        public IconStampInfo icon_stamp_info;
        public PostAntiInfo info;
        public String invitees_number;
        public String msg;
        public String opgroup;
        public String pid;
        public String pre_msg;
        public ThreadEasterEgg star_info;
        public SuccessToast success_toast;
        public TbInteraction tb_hudong;
        public String tid;
        public Toast toast;
        public ZhiBoInfoTW twzhibo_info;
        public String video_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.opgroup = dataRes.opgroup;
            this.tid = dataRes.tid;
            this.pid = dataRes.pid;
            this.video_id = dataRes.video_id;
            this.msg = dataRes.msg;
            this.pre_msg = dataRes.pre_msg;
            this.color_msg = dataRes.color_msg;
            this.twzhibo_info = dataRes.twzhibo_info;
            this.exp = dataRes.exp;
            this.contri_info = dataRes.contri_info;
            this.star_info = dataRes.star_info;
            this.advertisement = dataRes.advertisement;
            this.icon_stamp_info = dataRes.icon_stamp_info;
            this.info = dataRes.info;
            this.anti_stat = dataRes.anti_stat;
            this.tb_hudong = dataRes.tb_hudong;
            this.anti = dataRes.anti;
            this.ext_msg = dataRes.ext_msg;
            this.invitees_number = dataRes.invitees_number;
            this.toast = dataRes.toast;
            this.success_toast = dataRes.success_toast;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.opgroup;
            if (str == null) {
                this.opgroup = "";
            } else {
                this.opgroup = str;
            }
            String str2 = builder.tid;
            if (str2 == null) {
                this.tid = "";
            } else {
                this.tid = str2;
            }
            String str3 = builder.pid;
            if (str3 == null) {
                this.pid = "";
            } else {
                this.pid = str3;
            }
            String str4 = builder.video_id;
            if (str4 == null) {
                this.video_id = "";
            } else {
                this.video_id = str4;
            }
            String str5 = builder.msg;
            if (str5 == null) {
                this.msg = "";
            } else {
                this.msg = str5;
            }
            String str6 = builder.pre_msg;
            if (str6 == null) {
                this.pre_msg = "";
            } else {
                this.pre_msg = str6;
            }
            String str7 = builder.color_msg;
            if (str7 == null) {
                this.color_msg = "";
            } else {
                this.color_msg = str7;
            }
            this.twzhibo_info = builder.twzhibo_info;
            this.exp = builder.exp;
            this.contri_info = builder.contri_info;
            this.star_info = builder.star_info;
            this.advertisement = builder.advertisement;
            this.icon_stamp_info = builder.icon_stamp_info;
            this.info = builder.info;
            this.anti_stat = builder.anti_stat;
            this.tb_hudong = builder.tb_hudong;
            this.anti = builder.anti;
            String str8 = builder.ext_msg;
            if (str8 == null) {
                this.ext_msg = "";
            } else {
                this.ext_msg = str8;
            }
            String str9 = builder.invitees_number;
            if (str9 == null) {
                this.invitees_number = "";
            } else {
                this.invitees_number = str9;
            }
            this.toast = builder.toast;
            this.success_toast = builder.success_toast;
            return;
        }
        this.opgroup = builder.opgroup;
        this.tid = builder.tid;
        this.pid = builder.pid;
        this.video_id = builder.video_id;
        this.msg = builder.msg;
        this.pre_msg = builder.pre_msg;
        this.color_msg = builder.color_msg;
        this.twzhibo_info = builder.twzhibo_info;
        this.exp = builder.exp;
        this.contri_info = builder.contri_info;
        this.star_info = builder.star_info;
        this.advertisement = builder.advertisement;
        this.icon_stamp_info = builder.icon_stamp_info;
        this.info = builder.info;
        this.anti_stat = builder.anti_stat;
        this.tb_hudong = builder.tb_hudong;
        this.anti = builder.anti;
        this.ext_msg = builder.ext_msg;
        this.invitees_number = builder.invitees_number;
        this.toast = builder.toast;
        this.success_toast = builder.success_toast;
    }
}