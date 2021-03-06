package help.smartbusiness.smartaccounting.Utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by gamerboy on 3/13/17.
 * <p>
 * A custom {@link TextView} to show values stored as long formatted on
 * two decimal places.
 */

public class DecimalFormatterTextView extends TextView {

    public DecimalFormatterTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        String formatted = Utils.convertLongToDecimal(text);
        if (formatted != null) {
            super.setText(formatted, type);
            return;
        }
        super.setText(text, type);
    }
}
