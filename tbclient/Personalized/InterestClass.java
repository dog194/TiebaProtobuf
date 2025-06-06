package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class InterestClass extends Message {
    public static final List<ClassList> DEFAULT_CLASS_LIST = Collections.emptyList();
    public static final Long DEFAULT_FLOOR = 0L;
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_ICON_SCHEMA = "";
    public static final String DEFAULT_ICON_TEXT = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ClassList> class_list;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long floor;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String icon_schema;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_text;

    public static final class Builder extends Message.Builder<InterestClass> {
        public List<ClassList> class_list;
        public Long floor;
        public String icon;
        public String icon_schema;
        public String icon_text;

        public Builder() {
        }

        public Builder(InterestClass interestClass) {
            super(interestClass);
            if (interestClass == null) {
                return;
            }
            this.class_list = Message.copyOf(interestClass.class_list);
            this.floor = interestClass.floor;
            this.icon = interestClass.icon;
            this.icon_text = interestClass.icon_text;
            this.icon_schema = interestClass.icon_schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public InterestClass build(boolean z) {
            return new InterestClass(this, z);
        }
    }

    public InterestClass(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ClassList> list = builder.class_list;
            if (list == null) {
                this.class_list = DEFAULT_CLASS_LIST;
            } else {
                this.class_list = Message.immutableCopyOf(list);
            }
            Long l = builder.floor;
            if (l == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = l;
            }
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.icon_text;
            if (str2 == null) {
                this.icon_text = "";
            } else {
                this.icon_text = str2;
            }
            String str3 = builder.icon_schema;
            if (str3 == null) {
                this.icon_schema = "";
                return;
            } else {
                this.icon_schema = str3;
                return;
            }
        }
        this.class_list = Message.immutableCopyOf(builder.class_list);
        this.floor = builder.floor;
        this.icon = builder.icon;
        this.icon_text = builder.icon_text;
        this.icon_schema = builder.icon_schema;
    }
}