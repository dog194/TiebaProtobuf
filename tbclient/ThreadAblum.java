package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadAblum extends Message {
    public static final String DEFAULT_SOURCE = "";
    public static final String DEFAULT_SUB_SOURCE = "";
    public static final String DEFAULT_THREAD_SORT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String source;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String sub_source;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tab_id;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_sort_text;

    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long tid;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer type;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ID = 0;
    public static final Long DEFAULT_TAB_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_TID = 0L;

    public static final class Builder extends Message.Builder<ThreadAblum> {
        public Integer id;
        public String source;
        public String sub_source;
        public Long tab_id;
        public String thread_sort_text;
        public Long tid;
        public String title;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(ThreadAblum threadAblum) {
            super(threadAblum);
            if (threadAblum == null) {
                return;
            }
            this.id = threadAblum.id;
            this.tab_id = threadAblum.tab_id;
            this.title = threadAblum.title;
            this.source = threadAblum.source;
            this.thread_sort_text = threadAblum.thread_sort_text;
            this.sub_source = threadAblum.sub_source;
            this.url = threadAblum.url;
            this.type = threadAblum.type;
            this.tid = threadAblum.tid;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadAblum build(boolean z) {
            return new ThreadAblum(this, z);
        }
    }

    public ThreadAblum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Long l = builder.tab_id;
            if (l == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.source;
            if (str2 == null) {
                this.source = "";
            } else {
                this.source = str2;
            }
            String str3 = builder.thread_sort_text;
            if (str3 == null) {
                this.thread_sort_text = "";
            } else {
                this.thread_sort_text = str3;
            }
            String str4 = builder.sub_source;
            if (str4 == null) {
                this.sub_source = "";
            } else {
                this.sub_source = str4;
            }
            String str5 = builder.url;
            if (str5 == null) {
                this.url = "";
            } else {
                this.url = str5;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = l2;
                return;
            }
        }
        this.id = builder.id;
        this.tab_id = builder.tab_id;
        this.title = builder.title;
        this.source = builder.source;
        this.thread_sort_text = builder.thread_sort_text;
        this.sub_source = builder.sub_source;
        this.url = builder.url;
        this.type = builder.type;
        this.tid = builder.tid;
    }
}