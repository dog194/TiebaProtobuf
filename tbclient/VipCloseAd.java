package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class VipCloseAd extends Message {
    public static final String DEFAULT_VIP_CLOSE_TIP = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
    public final List<Integer> forum_close;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_open;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer live_close;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer shield_status;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer vip_close;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String vip_close_tip;
    public static final Integer DEFAULT_IS_OPEN = 0;
    public static final Integer DEFAULT_VIP_CLOSE = 0;
    public static final List<Integer> DEFAULT_FORUM_CLOSE = Collections.emptyList();
    public static final Integer DEFAULT_LIVE_CLOSE = 0;
    public static final Integer DEFAULT_SHIELD_STATUS = 0;

    public static final class Builder extends Message.Builder<VipCloseAd> {
        public List<Integer> forum_close;
        public Integer is_open;
        public Integer live_close;
        public Integer shield_status;
        public Integer vip_close;
        public String vip_close_tip;

        public Builder() {
        }

        public Builder(VipCloseAd vipCloseAd) {
            super(vipCloseAd);
            if (vipCloseAd == null) {
                return;
            }
            this.is_open = vipCloseAd.is_open;
            this.vip_close = vipCloseAd.vip_close;
            this.forum_close = Message.copyOf(vipCloseAd.forum_close);
            this.live_close = vipCloseAd.live_close;
            this.shield_status = vipCloseAd.shield_status;
            this.vip_close_tip = vipCloseAd.vip_close_tip;
        }

        @Override // com.squareup.wire.Message.Builder
        public VipCloseAd build(boolean z) {
            return new VipCloseAd(this, z);
        }
    }

    public VipCloseAd(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_open;
            if (num == null) {
                this.is_open = DEFAULT_IS_OPEN;
            } else {
                this.is_open = num;
            }
            Integer num2 = builder.vip_close;
            if (num2 == null) {
                this.vip_close = DEFAULT_VIP_CLOSE;
            } else {
                this.vip_close = num2;
            }
            List<Integer> list = builder.forum_close;
            if (list == null) {
                this.forum_close = DEFAULT_FORUM_CLOSE;
            } else {
                this.forum_close = Message.immutableCopyOf(list);
            }
            Integer num3 = builder.live_close;
            if (num3 == null) {
                this.live_close = DEFAULT_LIVE_CLOSE;
            } else {
                this.live_close = num3;
            }
            Integer num4 = builder.shield_status;
            if (num4 == null) {
                this.shield_status = DEFAULT_SHIELD_STATUS;
            } else {
                this.shield_status = num4;
            }
            String str = builder.vip_close_tip;
            if (str == null) {
                this.vip_close_tip = "";
                return;
            } else {
                this.vip_close_tip = str;
                return;
            }
        }
        this.is_open = builder.is_open;
        this.vip_close = builder.vip_close;
        this.forum_close = Message.immutableCopyOf(builder.forum_close);
        this.live_close = builder.live_close;
        this.shield_status = builder.shield_status;
        this.vip_close_tip = builder.vip_close_tip;
    }
}