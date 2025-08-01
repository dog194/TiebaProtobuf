package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Country extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    public static final class Builder extends Message.Builder<Country> {
        public String icon;
        public String name;

        public Builder() {
        }

        public Builder(Country country) {
            super(country);
            if (country == null) {
                return;
            }
            this.icon = country.icon;
            this.name = country.name;
        }

        @Override // com.squareup.wire.Message.Builder
        public Country build(boolean z) {
            return new Country(this, z);
        }
    }

    public Country(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
                return;
            } else {
                this.name = str2;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
    }
}