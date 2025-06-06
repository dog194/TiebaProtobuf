package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class InterestClassList extends Message {
    public static final String DEFAULT_CLASS_NAME = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long class_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_name;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_choose;
    public static final Long DEFAULT_CLASS_ID = 0L;
    public static final Integer DEFAULT_HAS_CHOOSE = 0;

    public static final class Builder extends Message.Builder<InterestClassList> {
        public Long class_id;
        public String class_name;
        public Integer has_choose;

        public Builder() {
        }

        public Builder(InterestClassList interestClassList) {
            super(interestClassList);
            if (interestClassList == null) {
                return;
            }
            this.class_id = interestClassList.class_id;
            this.class_name = interestClassList.class_name;
            this.has_choose = interestClassList.has_choose;
        }

        @Override // com.squareup.wire.Message.Builder
        public InterestClassList build(boolean z) {
            return new InterestClassList(this, z);
        }
    }

    public InterestClassList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.class_id;
            if (l == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = l;
            }
            String str = builder.class_name;
            if (str == null) {
                this.class_name = "";
            } else {
                this.class_name = str;
            }
            Integer num = builder.has_choose;
            if (num == null) {
                this.has_choose = DEFAULT_HAS_CHOOSE;
                return;
            } else {
                this.has_choose = num;
                return;
            }
        }
        this.class_id = builder.class_id;
        this.class_name = builder.class_name;
        this.has_choose = builder.has_choose;
    }
}