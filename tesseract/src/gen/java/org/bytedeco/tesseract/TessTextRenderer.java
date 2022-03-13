// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


/**
 * Renders tesseract output into a plain UTF-8 text string
 */
@Namespace("tesseract") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class TessTextRenderer extends TessResultRenderer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TessTextRenderer(Pointer p) { super(p); }

  public TessTextRenderer(@Cast("const char*") BytePointer outputbase) { super((Pointer)null); allocate(outputbase); }
  private native void allocate(@Cast("const char*") BytePointer outputbase);
  public TessTextRenderer(String outputbase) { super((Pointer)null); allocate(outputbase); }
  private native void allocate(String outputbase);
}