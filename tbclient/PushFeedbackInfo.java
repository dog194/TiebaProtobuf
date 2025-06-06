package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class PushFeedbackInfo extends Message {
    public static final String DEFAULT_FEEDBACK_URL = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer _switch;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PushFeedBackButton> button_list;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer disappear_delay_time;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer display_delay_time;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String feedback_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PushFeedbackStrategy> show_strategy;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final List<PushFeedBackButton> DEFAULT_BUTTON_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SWITCH = 0;
    public static final List<PushFeedbackStrategy> DEFAULT_SHOW_STRATEGY = Collections.emptyList();
    public static final Integer DEFAULT_DISPLAY_DELAY_TIME = 0;
    public static final Integer DEFAULT_DISAPPEAR_DELAY_TIME = 0;

    public static final class Builder extends Message.Builder<PushFeedbackInfo> {
        public Integer _switch;
        public List<PushFeedBackButton> button_list;
        public Integer disappear_delay_time;
        public Integer display_delay_time;
        public String feedback_url;
        public List<PushFeedbackStrategy> show_strategy;
        public String title;

        public Builder() {
        }

        public Builder(PushFeedbackInfo pushFeedbackInfo) {
            super(pushFeedbackInfo);
            if (pushFeedbackInfo == null) {
                return;
            }
            this.title = pushFeedbackInfo.title;
            this.button_list = Message.copyOf(pushFeedbackInfo.button_list);
            this._switch = pushFeedbackInfo._switch;
            this.feedback_url = pushFeedbackInfo.feedback_url;
            this.show_strategy = Message.copyOf(pushFeedbackInfo.show_strategy);
            this.display_delay_time = pushFeedbackInfo.display_delay_time;
            this.disappear_delay_time = pushFeedbackInfo.disappear_delay_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public PushFeedbackInfo build(boolean z) {
            return new PushFeedbackInfo(this, z);
        }
    }

    public PushFeedbackInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<PushFeedBackButton> list = builder.button_list;
            if (list == null) {
                this.button_list = DEFAULT_BUTTON_LIST;
            } else {
                this.button_list = Message.immutableCopyOf(list);
            }
            Integer num = builder._switch;
            if (num == null) {
                this._switch = DEFAULT_SWITCH;
            } else {
                this._switch = num;
            }
            String str2 = builder.feedback_url;
            if (str2 == null) {
                this.feedback_url = "";
            } else {
                this.feedback_url = str2;
            }
            List<PushFeedbackStrategy> list2 = builder.show_strategy;
            if (list2 == null) {
                this.show_strategy = DEFAULT_SHOW_STRATEGY;
            } else {
                this.show_strategy = Message.immutableCopyOf(list2);
            }
            Integer num2 = builder.display_delay_time;
            if (num2 == null) {
                this.display_delay_time = DEFAULT_DISPLAY_DELAY_TIME;
            } else {
                this.display_delay_time = num2;
            }
            Integer num3 = builder.disappear_delay_time;
            if (num3 == null) {
                this.disappear_delay_time = DEFAULT_DISAPPEAR_DELAY_TIME;
                return;
            } else {
                this.disappear_delay_time = num3;
                return;
            }
        }
        this.title = builder.title;
        this.button_list = Message.immutableCopyOf(builder.button_list);
        this._switch = builder._switch;
        this.feedback_url = builder.feedback_url;
        this.show_strategy = Message.immutableCopyOf(builder.show_strategy);
        this.display_delay_time = builder.display_delay_time;
        this.disappear_delay_time = builder.disappear_delay_time;
    }
}