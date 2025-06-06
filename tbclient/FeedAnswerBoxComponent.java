package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedAnswerBoxComponent extends Message {
    public static final String DEFAULT_BOTTON_TEXT = "";
    public static final String DEFAULT_BOX_TEXT = "";
    public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String botton_text;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String box_text;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<LayoutManageInfo> manage_list;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;

    public static final class Builder extends Message.Builder<FeedAnswerBoxComponent> {
        public String botton_text;
        public String box_text;
        public List<LayoutManageInfo> manage_list;
        public String schema;

        public Builder() {
        }

        public Builder(FeedAnswerBoxComponent feedAnswerBoxComponent) {
            super(feedAnswerBoxComponent);
            if (feedAnswerBoxComponent == null) {
                return;
            }
            this.box_text = feedAnswerBoxComponent.box_text;
            this.botton_text = feedAnswerBoxComponent.botton_text;
            this.schema = feedAnswerBoxComponent.schema;
            this.manage_list = Message.copyOf(feedAnswerBoxComponent.manage_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedAnswerBoxComponent build(boolean z) {
            return new FeedAnswerBoxComponent(this, z);
        }
    }

    public FeedAnswerBoxComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.box_text;
            if (str == null) {
                this.box_text = "";
            } else {
                this.box_text = str;
            }
            String str2 = builder.botton_text;
            if (str2 == null) {
                this.botton_text = "";
            } else {
                this.botton_text = str2;
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
            } else {
                this.schema = str3;
            }
            List<LayoutManageInfo> list = builder.manage_list;
            if (list == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
                return;
            } else {
                this.manage_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.box_text = builder.box_text;
        this.botton_text = builder.botton_text;
        this.schema = builder.schema;
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
    }
}