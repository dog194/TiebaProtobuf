package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ClassList extends Message {
    public static final Integer DEFAULT_CLASS_ID = 0;
    public static final Integer DEFAULT_HAS_CHOOSE = 0;
    public static final String DEFAULT_NAME = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer class_id;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_choose;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    public static final class Builder extends Message.Builder<ClassList> {
        public Integer class_id;
        public Integer has_choose;
        public String name;

        public Builder() {
        }

        public Builder(ClassList classList) {
            super(classList);
            if (classList == null) {
                return;
            }
            this.class_id = classList.class_id;
            this.name = classList.name;
            this.has_choose = classList.has_choose;
        }

        @Override // com.squareup.wire.Message.Builder
        public ClassList build(boolean z) {
            return new ClassList(this, z);
        }
    }

    public ClassList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.class_id;
            if (num == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num2 = builder.has_choose;
            if (num2 == null) {
                this.has_choose = DEFAULT_HAS_CHOOSE;
                return;
            } else {
                this.has_choose = num2;
                return;
            }
        }
        this.class_id = builder.class_id;
        this.name = builder.name;
        this.has_choose = builder.has_choose;
    }
}