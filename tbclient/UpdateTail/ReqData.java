package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    public static final String DEFAULT_TAILCONTENT = "";
    public static final Integer DEFAULT_TAILID = 0;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 5)
    public final CommonReq f1553common;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String fontColor;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fontKeyName;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tailContent;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tailId;

    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1554common;
        public String fontColor;
        public String fontKeyName;
        public String tailContent;
        public Integer tailId;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.tailContent = reqData.tailContent;
            this.tailId = reqData.tailId;
            this.fontColor = reqData.fontColor;
            this.fontKeyName = reqData.fontKeyName;
            this.f1554common = reqData.f1553common;
        }

        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }

    public ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tailContent;
            if (str == null) {
                this.tailContent = "";
            } else {
                this.tailContent = str;
            }
            Integer num = builder.tailId;
            if (num == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = num;
            }
            String str2 = builder.fontColor;
            if (str2 == null) {
                this.fontColor = "";
            } else {
                this.fontColor = str2;
            }
            String str3 = builder.fontKeyName;
            if (str3 == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = str3;
            }
            this.f1553common = builder.f1554common;
            return;
        }
        this.tailContent = builder.tailContent;
        this.tailId = builder.tailId;
        this.fontColor = builder.fontColor;
        this.fontKeyName = builder.fontKeyName;
        this.f1553common = builder.f1554common;
    }
}