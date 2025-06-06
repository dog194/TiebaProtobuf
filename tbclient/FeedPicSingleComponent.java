package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedPicSingleComponent extends Message {
    public static final Double DEFAULT_CROP_POINT_HEIGHT_RATIO;
    public static final Double DEFAULT_CROP_POINT_WIDTH_RATIO;
    public static final List<PicDecoration> DEFAULT_DECORATION;
    public static final String DEFAULT_PIC_URL = "";

    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double crop_point_height_ratio;

    @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
    public final Double crop_point_width_ratio;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<PicDecoration> decoration;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer height;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_long_pic;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_IS_LONG_PIC = 0;

    public static final class Builder extends Message.Builder<FeedPicSingleComponent> {
        public Double crop_point_height_ratio;
        public Double crop_point_width_ratio;
        public List<PicDecoration> decoration;
        public Integer height;
        public Integer is_long_pic;
        public String pic_url;
        public Integer width;

        public Builder() {
        }

        public Builder(FeedPicSingleComponent feedPicSingleComponent) {
            super(feedPicSingleComponent);
            if (feedPicSingleComponent == null) {
                return;
            }
            this.pic_url = feedPicSingleComponent.pic_url;
            this.width = feedPicSingleComponent.width;
            this.height = feedPicSingleComponent.height;
            this.is_long_pic = feedPicSingleComponent.is_long_pic;
            this.crop_point_width_ratio = feedPicSingleComponent.crop_point_width_ratio;
            this.crop_point_height_ratio = feedPicSingleComponent.crop_point_height_ratio;
            this.decoration = Message.copyOf(feedPicSingleComponent.decoration);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedPicSingleComponent build(boolean z) {
            return new FeedPicSingleComponent(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_CROP_POINT_WIDTH_RATIO = valueOf;
        DEFAULT_CROP_POINT_HEIGHT_RATIO = valueOf;
        DEFAULT_DECORATION = Collections.emptyList();
    }

    public FeedPicSingleComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            Integer num = builder.width;
            if (num == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num;
            }
            Integer num2 = builder.height;
            if (num2 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num2;
            }
            Integer num3 = builder.is_long_pic;
            if (num3 == null) {
                this.is_long_pic = DEFAULT_IS_LONG_PIC;
            } else {
                this.is_long_pic = num3;
            }
            Double d = builder.crop_point_width_ratio;
            if (d == null) {
                this.crop_point_width_ratio = DEFAULT_CROP_POINT_WIDTH_RATIO;
            } else {
                this.crop_point_width_ratio = d;
            }
            Double d2 = builder.crop_point_height_ratio;
            if (d2 == null) {
                this.crop_point_height_ratio = DEFAULT_CROP_POINT_HEIGHT_RATIO;
            } else {
                this.crop_point_height_ratio = d2;
            }
            List<PicDecoration> list = builder.decoration;
            if (list == null) {
                this.decoration = DEFAULT_DECORATION;
                return;
            } else {
                this.decoration = Message.immutableCopyOf(list);
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.width = builder.width;
        this.height = builder.height;
        this.is_long_pic = builder.is_long_pic;
        this.crop_point_width_ratio = builder.crop_point_width_ratio;
        this.crop_point_height_ratio = builder.crop_point_height_ratio;
        this.decoration = Message.immutableCopyOf(builder.decoration);
    }
}