package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Baijiahao extends Message {
    public static final String DEFAULT_FORWARD_URL = "";
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final Integer DEFAULT_ORI_UGC_TYPE = 0;
    public static final String DEFAULT_ORI_UGC_VID = "";

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String forward_url;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer ori_ugc_type;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;

    public static final class Builder extends Message.Builder<Baijiahao> {
        public String forward_url;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public Integer ori_ugc_type;
        public String ori_ugc_vid;

        public Builder() {
        }

        public Builder(Baijiahao baijiahao) {
            super(baijiahao);
            if (baijiahao == null) {
                return;
            }
            this.ori_ugc_nid = baijiahao.ori_ugc_nid;
            this.ori_ugc_tid = baijiahao.ori_ugc_tid;
            this.ori_ugc_type = baijiahao.ori_ugc_type;
            this.ori_ugc_vid = baijiahao.ori_ugc_vid;
            this.forward_url = baijiahao.forward_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public Baijiahao build(boolean z) {
            return new Baijiahao(this, z);
        }
    }

    public Baijiahao(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.ori_ugc_nid;
            if (str == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str;
            }
            String str2 = builder.ori_ugc_tid;
            if (str2 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str2;
            }
            Integer num = builder.ori_ugc_type;
            if (num == null) {
                this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
            } else {
                this.ori_ugc_type = num;
            }
            String str3 = builder.ori_ugc_vid;
            if (str3 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str3;
            }
            String str4 = builder.forward_url;
            if (str4 == null) {
                this.forward_url = "";
                return;
            } else {
                this.forward_url = str4;
                return;
            }
        }
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.forward_url = builder.forward_url;
    }
}