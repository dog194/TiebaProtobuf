package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LabelInfo extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LABELCONTENT = "";
    public static final String DEFAULT_LABELID = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String labelContent;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer labelHot;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String labelId;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_LABELHOT = 0;
    public static final Integer DEFAULT_TYPE = 0;

    public static final class Builder extends Message.Builder<LabelInfo> {
        public String img_url;
        public String labelContent;
        public Integer labelHot;
        public String labelId;
        public Integer type;

        public Builder() {
        }

        public Builder(LabelInfo labelInfo) {
            super(labelInfo);
            if (labelInfo == null) {
                return;
            }
            this.labelHot = labelInfo.labelHot;
            this.labelContent = labelInfo.labelContent;
            this.labelId = labelInfo.labelId;
            this.img_url = labelInfo.img_url;
            this.type = labelInfo.type;
        }

        @Override // com.squareup.wire.Message.Builder
        public LabelInfo build(boolean z) {
            return new LabelInfo(this, z);
        }
    }

    public LabelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.labelHot;
            if (num == null) {
                this.labelHot = DEFAULT_LABELHOT;
            } else {
                this.labelHot = num;
            }
            String str = builder.labelContent;
            if (str == null) {
                this.labelContent = "";
            } else {
                this.labelContent = str;
            }
            String str2 = builder.labelId;
            if (str2 == null) {
                this.labelId = "";
            } else {
                this.labelId = str2;
            }
            String str3 = builder.img_url;
            if (str3 == null) {
                this.img_url = "";
            } else {
                this.img_url = str3;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num2;
                return;
            }
        }
        this.labelHot = builder.labelHot;
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
        this.img_url = builder.img_url;
        this.type = builder.type;
    }
}