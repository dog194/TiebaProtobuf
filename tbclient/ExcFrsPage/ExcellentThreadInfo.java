package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ZhiBoInfoTW;

/* loaded from: classes4.dex */
public final class ExcellentThreadInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ABTEST = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String abtest;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long excid;

    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long forum_id;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer frs_type;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer pb_type;

    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long post_num;

    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer publish_time;

    @ProtoField(tag = 18, type = Message.Datatype.UINT64)
    public final Long rank;

    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer source;

    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long tag_code;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String tag_name;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer thread_type;

    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> thumbnail;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 13)
    public final ZhiBoInfoTW twzhibo_info;

    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long zansum;
    public static final Long DEFAULT_EXCID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_FRS_TYPE = 0;
    public static final Integer DEFAULT_PB_TYPE = 0;
    public static final List<String> DEFAULT_THUMBNAIL = Collections.emptyList();
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final Long DEFAULT_ZANSUM = 0L;
    public static final Long DEFAULT_POST_NUM = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_SOURCE = 0;
    public static final Long DEFAULT_RANK = 0L;
    public static final Integer DEFAULT_PUBLISH_TIME = 0;

    public static final class Builder extends Message.Builder<ExcellentThreadInfo> {
        public String _abstract;
        public String abtest;
        public Long excid;
        public Long forum_id;
        public String forum_name;
        public Integer frs_type;
        public Integer pb_type;
        public Long post_num;
        public Integer publish_time;
        public Long rank;
        public Integer source;
        public Long tag_code;
        public String tag_name;
        public Long thread_id;
        public Integer thread_type;
        public List<String> thumbnail;
        public String title;
        public ZhiBoInfoTW twzhibo_info;
        public Long zansum;

        public Builder() {
        }

        public Builder(ExcellentThreadInfo excellentThreadInfo) {
            super(excellentThreadInfo);
            if (excellentThreadInfo == null) {
                return;
            }
            this.excid = excellentThreadInfo.excid;
            this.thread_id = excellentThreadInfo.thread_id;
            this.frs_type = excellentThreadInfo.frs_type;
            this.pb_type = excellentThreadInfo.pb_type;
            this.title = excellentThreadInfo.title;
            this._abstract = excellentThreadInfo._abstract;
            this.thumbnail = Message.copyOf(excellentThreadInfo.thumbnail);
            this.tag_code = excellentThreadInfo.tag_code;
            this.tag_name = excellentThreadInfo.tag_name;
            this.zansum = excellentThreadInfo.zansum;
            this.post_num = excellentThreadInfo.post_num;
            this.thread_type = excellentThreadInfo.thread_type;
            this.twzhibo_info = excellentThreadInfo.twzhibo_info;
            this.forum_id = excellentThreadInfo.forum_id;
            this.forum_name = excellentThreadInfo.forum_name;
            this.abtest = excellentThreadInfo.abtest;
            this.source = excellentThreadInfo.source;
            this.rank = excellentThreadInfo.rank;
            this.publish_time = excellentThreadInfo.publish_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExcellentThreadInfo build(boolean z) {
            return new ExcellentThreadInfo(this, z);
        }
    }

    public ExcellentThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.excid;
            if (l == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Integer num = builder.frs_type;
            if (num == null) {
                this.frs_type = DEFAULT_FRS_TYPE;
            } else {
                this.frs_type = num;
            }
            Integer num2 = builder.pb_type;
            if (num2 == null) {
                this.pb_type = DEFAULT_PB_TYPE;
            } else {
                this.pb_type = num2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            List<String> list = builder.thumbnail;
            if (list == null) {
                this.thumbnail = DEFAULT_THUMBNAIL;
            } else {
                this.thumbnail = Message.immutableCopyOf(list);
            }
            Long l3 = builder.tag_code;
            if (l3 == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = l3;
            }
            String str3 = builder.tag_name;
            if (str3 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str3;
            }
            Long l4 = builder.zansum;
            if (l4 == null) {
                this.zansum = DEFAULT_ZANSUM;
            } else {
                this.zansum = l4;
            }
            Long l5 = builder.post_num;
            if (l5 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l5;
            }
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            this.twzhibo_info = builder.twzhibo_info;
            Long l6 = builder.forum_id;
            if (l6 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l6;
            }
            String str4 = builder.forum_name;
            if (str4 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str4;
            }
            String str5 = builder.abtest;
            if (str5 == null) {
                this.abtest = "";
            } else {
                this.abtest = str5;
            }
            Integer num4 = builder.source;
            if (num4 == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = num4;
            }
            Long l7 = builder.rank;
            if (l7 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = l7;
            }
            Integer num5 = builder.publish_time;
            if (num5 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
                return;
            } else {
                this.publish_time = num5;
                return;
            }
        }
        this.excid = builder.excid;
        this.thread_id = builder.thread_id;
        this.frs_type = builder.frs_type;
        this.pb_type = builder.pb_type;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.thumbnail = Message.immutableCopyOf(builder.thumbnail);
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.zansum = builder.zansum;
        this.post_num = builder.post_num;
        this.thread_type = builder.thread_type;
        this.twzhibo_info = builder.twzhibo_info;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.abtest = builder.abtest;
        this.source = builder.source;
        this.rank = builder.rank;
        this.publish_time = builder.publish_time;
    }
}