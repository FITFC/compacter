package net.bdew.compacter

import net.bdew.compacter.blocks.{CraftMode, RecurseMode}
import net.bdew.lib.gui._
import net.bdew.lib.multiblock.data.RSMode
import net.minecraft.util.ResourceLocation

object Textures {
  val image = new ResourceLocation("compacter", "textures/gui/compacter.png")

  val buttonBase = Texture(image, 178, 2, 16, 16)
  val buttonHover = Texture(image, 194, 2, 16, 16)

  val powerFill = Texture(image, 178, 73, 13, 51)

  val modeTextures = Map[AnyRef, Texture](
    RecurseMode.DISABLED -> Texture(image, 211, 3, 14, 14),
    RecurseMode.ENABLED -> Texture(image, 227, 3, 14, 14),

    RSMode.RS_OFF -> Texture(image, 179, 19, 14, 14),
    RSMode.RS_ON -> Texture(image, 195, 19, 14, 14),
    RSMode.ALWAYS -> Texture(image, 211, 19, 14, 14),
    RSMode.NEVER -> Texture(image, 227, 19, 14, 14),

    CraftMode.TWO_THREE -> Texture(image, 179, 35, 14, 14),
    CraftMode.THREE_TWO -> Texture(image, 195, 35, 14, 14),
    CraftMode.THREE_ONLY -> Texture(image, 211, 35, 14, 14),
    CraftMode.TWO_ONLY -> Texture(image, 227, 35, 14, 14)
  )
}