package tbclient.GetShoubaiThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PageInfo extends Message {

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long cursor;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer page_size;
    public static final Integer DEFAULT_PAGE_SIZE = 0;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_HAS_MORE = 0;

    public static final class Builder extends Message.Builder<PageInfo> {
        public Long cursor;
        public Integer has_more;
        public Integer page_size;

        public Builder() {
        }

        public Builder(PageInfo pageInfo) {
            super(pageInfo);
            if (pageInfo == null) {
                return;
            }
            this.page_size = pageInfo.page_size;
            this.cursor = pageInfo.cursor;
            this.has_more = pageInfo.has_more;
        }

        @Override // com.squareup.wire.Message.Builder
        public PageInfo build(boolean z) {
            return new PageInfo(this, z);
        }
    }

    public PageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.page_size;
            if (num == null) {
                this.page_size = DEFAULT_PAGE_SIZE;
            } else {
                this.page_size = num;
            }
            Long l = builder.cursor;
            if (l == null) {
                this.cursor = DEFAULT_CURSOR;
            } else {
                this.cursor = l;
            }
            Integer num2 = builder.has_more;
            if (num2 == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num2;
                return;
            }
        }
        this.page_size = builder.page_size;
        this.cursor = builder.cursor;
        this.has_more = builder.has_more;
    }
}