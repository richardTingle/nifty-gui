package de.lessvoid.nifty.renderer.jogl.render.batch;

import de.lessvoid.nifty.batch.BatchRenderBackendInternal;
import de.lessvoid.nifty.batch.spi.BatchRenderBackend;
import de.lessvoid.nifty.renderer.jogl.render.JoglBufferFactory;
import de.lessvoid.nifty.renderer.jogl.render.JoglGL;
import de.lessvoid.nifty.renderer.jogl.render.JoglImageFactory;
import de.lessvoid.nifty.renderer.jogl.render.JoglMouseCursorFactory;

import javax.annotation.Nonnull;

/**
 * @author Aaron Mahan &lt;aaron@forerunnergames.com&gt;
 */
public class JoglBatchRenderBackendFactory {
  @Nonnull
  public static BatchRenderBackend create() {
    return new JoglBatchRenderBackend(
            new BatchRenderBackendInternal(
                    new JoglGL(),
                    new JoglBatchFactory(),
                    new JoglBufferFactory(),
                    new JoglImageFactory(),
                    new JoglMouseCursorFactory()));
  }
}