package booktail.Nayos.blocks.machines;

import booktail.Nayos.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiHarmonyFurnace extends GuiContainer{

	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/harmonyfurnace.png");
	private final InventoryPlayer player;
	private final TileEntityNativusHarmony tileentity;
	
	
	public GuiHarmonyFurnace(InventoryPlayer player, TileEntityNativusHarmony tileentity) {
		
		super(new ContainerHarmony(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;

	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		
		String furnaceName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(furnaceName, (this.xSize / 2 - this.fontRenderer.getStringWidth(furnaceName) / 2) + 3, 6, 4210752);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);	
		
		if (TileEntityNativusHarmony.isBurning(tileentity))
		{
			int k = getBurnLeftScale(13);
			this.drawTexturedModalRect(this.guiLeft + 56, this.guiTop + 36 + 12 - k, 176, 12 - k, 14, k + 1);
			
		}
		
		int l = this.getCookedProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 79, this.guiTop + 34, 176, 14, l + 1, 16);
		
		
		
	}

	private int getBurnLeftScale(int pixels)
	{
		int i = this.tileentity.getField(1);
		if (i == 0) i = 200;
		return this.tileentity.getField(0) * pixels / i;
	}
	
	private int getCookedProgressScaled(int pixels)
	{
		int i = this.tileentity.getField(2);
		int j = this.tileentity.getField(3);
		return i != 0 && j != 0 ? i * pixels / j : 0;

	}
	
	
}
