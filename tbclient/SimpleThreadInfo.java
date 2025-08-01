package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SimpleThreadInfo extends Message {
    public static final String DEFAULT_TITLE = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<Abstract> _abstract;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer last_time_int;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer reply_num;

    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long thread_type;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 6)
    public final Zan zan;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Integer DEFAULT_LAST_TIME_INT = 0;
    public static final List<Abstract> DEFAULT_ABSTRACT = Collections.emptyList();
    public static final Long DEFAULT_THREAD_TYPE = 0L;

    public static final class Builder extends Message.Builder<SimpleThreadInfo> {
        public List<Abstract> _abstract;
        public Integer last_time_int;
        public Integer reply_num;
        public Long thread_type;
        public Long tid;
        public String title;
        public Zan zan;

        public Builder() {
        }

        public Builder(SimpleThreadInfo simpleThreadInfo) {
            super(simpleThreadInfo);
            if (simpleThreadInfo == null) {
                return;
            }
            this.tid = simpleThreadInfo.tid;
            this.title = simpleThreadInfo.title;
            this.reply_num = simpleThreadInfo.reply_num;
            this.last_time_int = simpleThreadInfo.last_time_int;
            this._abstract = Message.copyOf(simpleThreadInfo._abstract);
            this.zan = simpleThreadInfo.zan;
            this.thread_type = simpleThreadInfo.thread_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public SimpleThreadInfo build(boolean z) {
            return new SimpleThreadInfo(this, z);
        }
    }

    public SimpleThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.reply_num;
            if (num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num;
            }
            Integer num2 = builder.last_time_int;
            if (num2 == null) {
                this.last_time_int = DEFAULT_LAST_TIME_INT;
            } else {
                this.last_time_int = num2;
            }
            List<Abstract> list = builder._abstract;
            if (list == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list);
            }
            this.zan = builder.zan;
            Long l2 = builder.thread_type;
            if (l2 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
                return;
            } else {
                this.thread_type = l2;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this.last_time_int = builder.last_time_int;
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.zan = builder.zan;
        this.thread_type = builder.thread_type;
    }
}