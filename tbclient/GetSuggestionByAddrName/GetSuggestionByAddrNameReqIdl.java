package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetSuggestionByAddrNameReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetSuggestionByAddrNameReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetSuggestionByAddrNameReqIdl getSuggestionByAddrNameReqIdl) {
            super(getSuggestionByAddrNameReqIdl);
            if (getSuggestionByAddrNameReqIdl == null) {
                return;
            }
            this.data = getSuggestionByAddrNameReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetSuggestionByAddrNameReqIdl build(boolean z) {
            return new GetSuggestionByAddrNameReqIdl(this, z);
        }
    }

    public GetSuggestionByAddrNameReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}