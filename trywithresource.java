// if we don't want to use the finally block, then we have to use the try with resource.
// finally is bascially used for destroying the objects.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trywithresource {
    public static void main(String[]args)
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(null)))
    }
}
