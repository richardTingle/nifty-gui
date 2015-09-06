package de.lessvoid.nifty.node;

import de.lessvoid.nifty.spi.node.NiftyNode;
import de.lessvoid.nifty.spi.node.NiftyNodeImpl;

import javax.annotation.Nonnull;

/**
 * @author Martin Karing &lt;nitram@illarion.org&gt;
 */
public final class PaddingLayoutNode implements NiftyNode {
  @Nonnull
  private final PaddingLayoutNodeImpl implementation;

  public PaddingLayoutNode(final float allSides) {
    this(allSides, allSides);
  }

  public PaddingLayoutNode(final float topBottom, final float rightLeft) {
    this(topBottom, rightLeft, topBottom);
  }

  public PaddingLayoutNode(final float top, final float rightLeft, final float bottom) {
    this(top, rightLeft, bottom, rightLeft);
  }

  public PaddingLayoutNode(final float top, final float right, final float bottom, final float left) {
    this(new PaddingLayoutNodeImpl(top, right, bottom, left));
  }

  PaddingLayoutNode(@Nonnull final PaddingLayoutNodeImpl implementation) {
    this.implementation = implementation;
  }

  public float getLeft() {
    return implementation.getLeft();
  }

  public void setLeft(float left) {
    implementation.setLeft(left);
  }

  public float getRight() {
    return implementation.getRight();
  }

  public void setRight(float right) {
    implementation.setRight(right);
  }

  public float getTop() {
    return implementation.getTop();
  }

  public void setTop(float top) {
    implementation.setTop(top);
  }

  public float getBottom() {
    return implementation.getBottom();
  }

  public void setBottom(float bottom) {
    implementation.setBottom(bottom);
  }

  @Nonnull
  NiftyNodeImpl<PaddingLayoutNode> getImpl() {
    return implementation;
  }
}