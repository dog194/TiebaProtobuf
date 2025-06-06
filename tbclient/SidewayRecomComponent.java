package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SidewayRecomComponent extends Message {
    public static final String DEFAULT_CORNER_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<FeedKV> appendix;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 11)
    public final FeedButton button;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String corner_url;

    @ProtoField(tag = 3)
    public final FeedContentText desc;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 9)
    public final FeedContentText sub_desc;

    @ProtoField(tag = 10)
    public final TitleComponent tag_list;

    @ProtoField(tag = 2)
    public final FeedContentText title;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_APPENDIX = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<SidewayRecomComponent> {
        public List<FeedKV> appendix;
        public List<FeedKV> business_info;
        public FeedButton button;
        public String corner_url;
        public FeedContentText desc;
        public String img_url;
        public List<FeedKV> log_param;
        public String schema;
        public FeedContentText sub_desc;
        public TitleComponent tag_list;
        public FeedContentText title;
        public Integer type;

        public Builder() {
        }

        public Builder(SidewayRecomComponent sidewayRecomComponent) {
            super(sidewayRecomComponent);
            if (sidewayRecomComponent == null) {
                return;
            }
            this.type = sidewayRecomComponent.type;
            this.title = sidewayRecomComponent.title;
            this.desc = sidewayRecomComponent.desc;
            this.img_url = sidewayRecomComponent.img_url;
            this.corner_url = sidewayRecomComponent.corner_url;
            this.business_info = Message.copyOf(sidewayRecomComponent.business_info);
            this.schema = sidewayRecomComponent.schema;
            this.appendix = Message.copyOf(sidewayRecomComponent.appendix);
            this.sub_desc = sidewayRecomComponent.sub_desc;
            this.tag_list = sidewayRecomComponent.tag_list;
            this.button = sidewayRecomComponent.button;
            this.log_param = Message.copyOf(sidewayRecomComponent.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public SidewayRecomComponent build(boolean z) {
            return new SidewayRecomComponent(this, z);
        }
    }

    public SidewayRecomComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            this.title = builder.title;
            this.desc = builder.desc;
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.corner_url;
            if (str2 == null) {
                this.corner_url = "";
            } else {
                this.corner_url = str2;
            }
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list);
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
            } else {
                this.schema = str3;
            }
            List<FeedKV> list2 = builder.appendix;
            if (list2 == null) {
                this.appendix = DEFAULT_APPENDIX;
            } else {
                this.appendix = Message.immutableCopyOf(list2);
            }
            this.sub_desc = builder.sub_desc;
            this.tag_list = builder.tag_list;
            this.button = builder.button;
            List<FeedKV> list3 = builder.log_param;
            if (list3 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.type = builder.type;
        this.title = builder.title;
        this.desc = builder.desc;
        this.img_url = builder.img_url;
        this.corner_url = builder.corner_url;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.schema = builder.schema;
        this.appendix = Message.immutableCopyOf(builder.appendix);
        this.sub_desc = builder.sub_desc;
        this.tag_list = builder.tag_list;
        this.button = builder.button;
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}