package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BrandAward extends Message {
    public static final String DEFAULT_AWARD_ICON = "";
    public static final String DEFAULT_AWARD_NAME = "";
    public static final Integer DEFAULT_INDEX = 0;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String award_icon;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String award_name;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer index;

    public static final class Builder extends Message.Builder<BrandAward> {
        public String award_icon;
        public String award_name;
        public Integer index;

        public Builder() {
        }

        public Builder(BrandAward brandAward) {
            super(brandAward);
            if (brandAward == null) {
                return;
            }
            this.index = brandAward.index;
            this.award_name = brandAward.award_name;
            this.award_icon = brandAward.award_icon;
        }

        @Override // com.squareup.wire.Message.Builder
        public BrandAward build(boolean z) {
            return new BrandAward(this, z);
        }
    }

    public BrandAward(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.index;
            if (num == null) {
                this.index = DEFAULT_INDEX;
            } else {
                this.index = num;
            }
            String str = builder.award_name;
            if (str == null) {
                this.award_name = "";
            } else {
                this.award_name = str;
            }
            String str2 = builder.award_icon;
            if (str2 == null) {
                this.award_icon = "";
                return;
            } else {
                this.award_icon = str2;
                return;
            }
        }
        this.index = builder.index;
        this.award_name = builder.award_name;
        this.award_icon = builder.award_icon;
    }
}