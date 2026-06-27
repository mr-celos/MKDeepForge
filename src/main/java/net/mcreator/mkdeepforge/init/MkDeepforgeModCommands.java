/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mkdeepforge.init;

import net.mcreator.mkdeepforge.command.NoclipCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class MkDeepforgeModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, environment) -> {
			NoclipCommand.register(dispatcher, commandBuildContext, environment);
		});
	}
}