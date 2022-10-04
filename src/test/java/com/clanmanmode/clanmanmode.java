package com.clanmanmode;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class clanmanmode
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ClanManModePlugin.class);
		RuneLite.main(args);
	}
}